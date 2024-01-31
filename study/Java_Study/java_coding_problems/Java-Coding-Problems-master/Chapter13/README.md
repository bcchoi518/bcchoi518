# The HTTP Client and WebSocket APIs

This chapter includes 20 problems that are meant to cover the HTTP Client and WebSocket APIs.

Do you remember `HttpUrlConnection`? Well, JDK 11 comes with the HTTP Client API as a reinvention of `HttpUrlConnection`. The HTTP Client API is easy to use and supports HTTP/2 (default) and HTTP/1.1. For backward compatibility, the HTTP Client API will automatically downgrade from HTTP/2 to HTTP 1.1 when the server doesn't support HTTP/2. Moreover, the HTTP Client API supports synchronous and asynchronous programming models and relies on streams to transfer data (reactive streams). It also supports the WebSocket protocol, which is used in real-time web applications to provide client-server communication with low message overhead.

이 장에는 HTTP 클라이언트와 웹소켓 API를 다루기 위한 20개의 문제가 포함되어 있습니다.

`HttpUrlConnection`을 기억하시나요? JDK 11에는 `HttpUrlConnection`을 재창조한 HTTP 클라이언트 API가 함께 제공됩니다. HTTP 클라이언트 API는 사용하기 쉬우며 HTTP/2(기본값)와 HTTP/1.1을 지원합니다. 이전 버전과의 호환성을 위해 HTTP 클라이언트 API는 는 서버가 HTTP/2를 지원하지 않는 경우 자동으로 HTTP/2에서 HTTP 1.1로 다운그레이드됩니다. 또한, HTTP 클라이언트 API는 는 동기 및 비동기 프로그래밍 모델을 지원하며 스트림에 의존하여 데이터를 전송합니다(반응형 스트림). 또한 실시간 웹 애플리케이션에서 메시지 오버헤드가 적은 클라이언트-서버 통신을 제공하기 위해 사용되는 웹소켓 프로토콜을 지원합니다.
