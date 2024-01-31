# Barrier

Write a program that relies on **CyclicBarrier** to simulate the start process of a server. The server is considered started after its internal services has started. Services can be prepared for start concurrently (this is time-consuming), but they run interdependent, therefore, once they are ready to start, they must be started all at once.

서버의 시작 프로세스를 시뮬레이션하기 위해 **CyclicBarrier**에 의존하는 프로그램을 작성하세요. 서버는 내부 서비스가 시작된 후에 시작된 것으로 간주됩니다. 서비스는 동시에 시작할 수 있도록 준비할 수 있지만(시간이 많이 소요됨), 상호 의존적으로 실행되므로 시작할 준비가 되면 한꺼번에 시작해야 합니다.
