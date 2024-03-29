**[How To Efficiently Chunk A Java List](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/ChunkList)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-efficiently-chunk-a-java-list">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** Is a common scenario to have a big `List` and to need to chunk it in multiple smaller `List` of a given size. For example, if we want to employ a concurrent batch implementation we need to give each thread a sublist of items. Chunking a list can be done via Google Guava, `Lists.partition(List list, int size)` [method](https://guava.dev/releases/22.0/api/docs/com/google/common/collect/Lists.html#partition-java.util.List-int-) or Apache Commons Collections, `ListUtils.partition(List list, int size)` [method](<https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/ListUtils.html#partition(java.util.List,%20int)>). But, it can be implemented in plain Java as well. This application exposes 6 ways to do it. The trade-off is between the speed of implementation and speed of execution. For example, while the implementation relying on grouping collectors is not performing very well, it is quite simple and fast to write it.

**Description:** 큰 `List`이 있고 이를 주어진 크기의 작은 `List`으로 여러 개 분할해야 하는 경우가 흔합니다. 예를 들어 동시 배치 구현을 사용하려면 각 스레드에 항목의 하위 목록을 제공해야 합니다. 목록 청크는 구글 구아바, `Lists.partition(List list, int size)` [method](https://guava.dev/releases/22.0/api/docs/com/google/common/collect/Lists.html#partition-java.util.List-int-) 또는 아파치 커먼즈 컬렉션, `ListUtils.partition(List list, int size)` [method](<https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/ListUtils.html#partition(java.util.List,%20int)>)를 통해 수행할 수 있습니다. 하지만 일반 Java로도 구현할 수 있습니다. 이 애플리케이션에서는 6가지 방법을 소개합니다. 구현 속도와 실행 속도 사이에서 절충점을 찾아야 합니다. 예를 들어, 그룹화 수집기에 의존하는 구현은 성능이 좋지 않지만 작성하는 것은 매우 간단하고 빠릅니다.

**Key points:**

- the fastest execution is provided by `Chunk.java` class which relies on the built-in `List.subList()` method

**Time-performance trend graphic for chunking 500, 1_000_000, 10_000_000 and 20_000_000 items in lists of 5 items:**\
![](https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/ChunkList/head-to-head.png)

---

<table>
     <tr><td><b>If you need a deep dive into the performance recipes exposed in this repository then I am sure that you will love my book "Spring Boot Persistence Best Practices"</b></td><td><b>If you need a hand of tips and illustrations of 100+ Java persistence performance issues then "Java Persistence Performance Illustrated Guide" is for you.</b></td></tr>
     <tr><td>
<a href="https://www.apress.com/us/book/9781484256251"><p align="left"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Spring%20Boot%20Persistence%20Best%20Practices.jpg" height="500" width="450"/></p></a>
</td><td>
<a href="https://leanpub.com/java-persistence-performance-illustrated-guide"><p align="right"><img src="https://github.com/AnghelLeonard/Hibernate-SpringBoot/blob/master/Java%20Persistence%20Performance%20Illustrated%20Guide.jpg" height="500" width="450"/></p></a>
</td></tr></table>

---
