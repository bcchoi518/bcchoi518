# Phasers

Write a program that relies on **Phaser** to simulate the start process of a server in 3 phases. The server is considered started after its 5 internal services has started. At first phase, we need to concurrently start 3 services. At second phase, we need to concurrently start two more 2 services (these can be started only if the first 3 are already running). At phase 3 the server perform a final check in and is considered started.

**Phaser**를 사용하여 서버의 시작 과정을 3단계로 시뮬레이션하는 프로그램을 작성하세요. 서버는 5개의 내부 서비스가 시작된 후에 시작된 것으로 간주됩니다. 첫 번째 단계에서는 3개의 서비스를 동시에 시작해야 합니다. 두 번째 단계에서는 2개의 서비스를 추가로 시작해야 합니다(처음 3개의 서비스가 이미 실행 중인 경우에만 시작 가능). 3단계에서 서버는 최종 체크인을 수행하고 시작된 것으로 간주됩니다.
