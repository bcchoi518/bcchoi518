# Fork/join framework and compareAndSetForkJoinTaskTag()

Write a program that applies fork/join framework to a suite of interdependent tasks that should be executed only once (e.g. task D depends on task C and B, but, task C depends on task B as well, therefore task B must be executed only once, not twice).

한 번만 실행되어야 하는 상호 의존적인 작업 모음에 포크/조인 프레임워크를 적용하는 프로그램을 작성하세요(예: 작업 D는 작업 C와 B에 의존하지만, 작업 C는 작업 B에도 의존하므로 작업 B는 두 번이 아닌 한 번만 실행되어야 합니다).
