package org.example.di;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class BeanFactory {
    private final Set<Class<?>> preInstantiatedClazz;
    private Map<Class<?>, Object> beans = new HashMap<>(); // Class 타입 객체를 key로 갖고 실제 필요한 Instance를 value로 가지는 beans라는 인스턴스 변수 선언

    public BeanFactory(Set<Class<?>> preInstantiatedClazz) {
        this.preInstantiatedClazz = preInstantiatedClazz;
        initialize();
    }

    private void initialize() {
        // Class 타입 객체를 가지고 인스턴스를 생성해서 초기화를 해주는 코드
        for (Class<?> clazz : preInstantiatedClazz) {
            Object instance = createInstance(clazz);
            beans.put(clazz, instance);
        }
    }

    private Object createInstance(Class<?> clazz) {
        // 생성자
        // Class 타입 객체로 생성자를 조회해옴
        Constructor<?> constructor = findConstructor(clazz);
        
        // 파라미터
        // 생성자의 파라미터 정보를 조회해옴
        List<Object> parameters = new ArrayList<>();
        for (Class<?> typeClass : constructor.getParameterTypes()) {
            parameters.add(getParameterByClass(typeClass));
        }

        // 인스턴스 생성
        // 위에서 조회한 정보를 바탕으로 인스턴스를 생성
        try {
            return constructor.newInstance(parameters.toArray());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private Constructor<?> findConstructor(Class<?> clazz) {
        // Inject Annotation이 붙어있는 생성자를 가지고 옴
        Constructor<?> constructor = BeanFactoryUtils.getInjectedConstructor(clazz);

        if (Objects.nonNull(constructor)) {
            return constructor;
        }

        return clazz.getConstructors()[0];
    }

    private Object getParameterByClass(Class<?> typeClass) {
        // Class 타입을 key로 가지는 instance가 있는지 먼저 확인
        Object instanceBean = getBean(typeClass);

        // instance가 있으면 반환
        if (Objects.nonNull(instanceBean)) {
            return instanceBean;
        }

        // instance가 없으면 해당 Class타입을 가지고 재귀호출로 instance를 만들어주는 메소드를 호출
        return createInstance(typeClass);
    }

    public <T> T getBean(Class<T> requiredType) {
        return (T) beans.get(requiredType);
    }
}
