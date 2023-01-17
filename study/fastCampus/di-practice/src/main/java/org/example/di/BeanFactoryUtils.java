package org.example.di;

import org.example.annotation.Inject;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.util.Set;

public class BeanFactoryUtils {
    public static Constructor<?> getInjectedConstructor(Class<?> clazz) {
        // Class 타입 객체로 Inject Annotation이 붙은 생성자를 다 가지고 옴
        Set<Constructor> injectedConstructors = ReflectionUtils.getAllConstructors(clazz, ReflectionUtils.withAnnotation(Inject.class));

        // 없으면 null,
        if (injectedConstructors.isEmpty()) {
            return null;
        }
        // 있으면 Inject가 붙어있는 생성자를 리턴
        return injectedConstructors.iterator().next();
    }
}
