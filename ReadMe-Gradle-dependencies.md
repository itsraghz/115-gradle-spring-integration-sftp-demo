# Gradle Dependencies

```
raghavan.muthu@Raghavans-MacBook-Pro 115-gradle-spring-integration-sftp-demo % ./gradlew dependencies

> Task :dependencies

------------------------------------------------------------
Root project '115-gradle-spring-integration-sftp-demo'
------------------------------------------------------------

annotationProcessor - Annotation processors and their dependencies for source set 'main'.
\--- org.projectlombok:lombok -> 1.18.36

bootArchives - Configuration for Spring Boot archive artifacts. (n)
No dependencies

compileClasspath - Compile classpath for source set 'main'.
Invalid Java installation found at '/Library/Java/JavaVirtualMachines/adoptopenjdk-10.jdk/Contents/Home' (MacOS java_home) auto-detected. It will be re-checked in the next build. This might have performance impact if it keeps failing. Run the 'javaToolchains' task for more details.
+--- org.projectlombok:lombok -> 1.18.36
+--- org.springframework.boot:spring-boot-starter-integration -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4
|    |    |    +--- org.springframework:spring-core:6.2.5
|    |    |    |    \--- org.springframework:spring-jcl:6.2.5
|    |    |    \--- org.springframework:spring-context:6.2.5
|    |    |         +--- org.springframework:spring-aop:6.2.5
|    |    |         |    +--- org.springframework:spring-beans:6.2.5
|    |    |         |    |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |         +--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-expression:6.2.5
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         \--- io.micrometer:micrometer-observation:1.14.5
|    |    |              \--- io.micrometer:micrometer-commons:1.14.5
|    |    +--- org.springframework.boot:spring-boot-autoconfigure:3.4.4
|    |    |    \--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-starter-logging:3.4.4
|    |    |    +--- ch.qos.logback:logback-classic:1.5.18
|    |    |    |    +--- ch.qos.logback:logback-core:1.5.18
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.17
|    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.24.3
|    |    |    |    +--- org.apache.logging.log4j:log4j-api:2.24.3
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.16 -> 2.0.17
|    |    |    \--- org.slf4j:jul-to-slf4j:2.0.17
|    |    |         \--- org.slf4j:slf4j-api:2.0.17
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    \--- org.yaml:snakeyaml:2.3
|    \--- org.springframework.integration:spring-integration-core:6.4.3
|         +--- org.springframework:spring-aop:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-tx:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework.retry:spring-retry:2.0.11
|         +--- io.projectreactor:reactor-core:3.7.4
|         |    \--- org.reactivestreams:reactive-streams:1.0.4
|         \--- io.micrometer:micrometer-observation:1.14.5 (*)
+--- org.springframework.integration:spring-integration-sftp -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    +--- org.springframework.integration:spring-integration-file:6.4.3
|    |    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    |    \--- commons-io:commons-io:2.17.0
|    +--- org.springframework:spring-context-support:6.2.4 -> 6.2.5
|    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    +--- org.springframework:spring-context:6.2.5 (*)
|    |    \--- org.springframework:spring-core:6.2.5 (*)
|    \--- org.apache.sshd:sshd-sftp:2.14.0
|         +--- org.apache.sshd:sshd-core:2.14.0
|         |    +--- org.apache.sshd:sshd-common:2.14.0
|         |    |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
+--- org.springframework.boot:spring-boot-starter-web -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:3.4.4
|    |    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    |    +--- org.springframework:spring-web:6.2.5
|    |    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    |    \--- io.micrometer:micrometer-observation:1.14.5 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:3.4.4
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:10.1.39
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:10.1.39
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    +--- org.springframework:spring-web:6.2.5 (*)
|    \--- org.springframework:spring-webmvc:6.2.5
|         +--- org.springframework:spring-aop:6.2.5 (*)
|         +--- org.springframework:spring-beans:6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.5 (*)
|         +--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-expression:6.2.5 (*)
|         \--- org.springframework:spring-web:6.2.5 (*)
+--- org.springframework.integration:spring-integration-http -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    \--- org.springframework:spring-webmvc:6.2.4 -> 6.2.5 (*)
\--- com.jcraft:jsch:0.1.55

compileOnly - Compile-only dependencies for the 'main' feature. (n)
\--- org.projectlombok:lombok (n)

default - Configuration for default artifacts. (n)
No dependencies

developmentOnly - Configuration for development-only dependencies such as Spring Boot's DevTools.
No dependencies

implementation - Implementation dependencies for the 'main' feature. (n)
+--- org.springframework.boot:spring-boot-starter-integration (n)
+--- org.springframework.integration:spring-integration-sftp (n)
+--- org.springframework.boot:spring-boot-starter-web (n)
+--- org.springframework.integration:spring-integration-http (n)
\--- com.jcraft:jsch:0.1.55 (n)

mainSourceElements - List of source directories contained in the Main SourceSet. (n)
No dependencies

productionRuntimeClasspath
+--- org.springframework.boot:spring-boot-starter-integration -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4
|    |    |    +--- org.springframework:spring-core:6.2.5
|    |    |    |    \--- org.springframework:spring-jcl:6.2.5
|    |    |    \--- org.springframework:spring-context:6.2.5
|    |    |         +--- org.springframework:spring-aop:6.2.5
|    |    |         |    +--- org.springframework:spring-beans:6.2.5
|    |    |         |    |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |         +--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-expression:6.2.5
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         \--- io.micrometer:micrometer-observation:1.14.5
|    |    |              \--- io.micrometer:micrometer-commons:1.14.5
|    |    +--- org.springframework.boot:spring-boot-autoconfigure:3.4.4
|    |    |    \--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-starter-logging:3.4.4
|    |    |    +--- ch.qos.logback:logback-classic:1.5.18
|    |    |    |    +--- ch.qos.logback:logback-core:1.5.18
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.17
|    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.24.3
|    |    |    |    +--- org.apache.logging.log4j:log4j-api:2.24.3
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.16 -> 2.0.17
|    |    |    \--- org.slf4j:jul-to-slf4j:2.0.17
|    |    |         \--- org.slf4j:slf4j-api:2.0.17
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    \--- org.yaml:snakeyaml:2.3
|    \--- org.springframework.integration:spring-integration-core:6.4.3
|         +--- org.springframework:spring-aop:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-tx:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework.retry:spring-retry:2.0.11
|         +--- io.projectreactor:reactor-core:3.7.4
|         |    \--- org.reactivestreams:reactive-streams:1.0.4
|         \--- io.micrometer:micrometer-observation:1.14.5 (*)
+--- org.springframework.integration:spring-integration-sftp -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    +--- org.springframework.integration:spring-integration-file:6.4.3
|    |    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    |    \--- commons-io:commons-io:2.17.0
|    +--- org.springframework:spring-context-support:6.2.4 -> 6.2.5
|    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    +--- org.springframework:spring-context:6.2.5 (*)
|    |    \--- org.springframework:spring-core:6.2.5 (*)
|    \--- org.apache.sshd:sshd-sftp:2.14.0
|         +--- org.apache.sshd:sshd-core:2.14.0
|         |    +--- org.apache.sshd:sshd-common:2.14.0
|         |    |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
+--- org.springframework.boot:spring-boot-starter-web -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:3.4.4
|    |    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    |    +--- org.springframework:spring-web:6.2.5
|    |    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    |    \--- io.micrometer:micrometer-observation:1.14.5 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:3.4.4
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:10.1.39
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:10.1.39
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    +--- org.springframework:spring-web:6.2.5 (*)
|    \--- org.springframework:spring-webmvc:6.2.5
|         +--- org.springframework:spring-aop:6.2.5 (*)
|         +--- org.springframework:spring-beans:6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.5 (*)
|         +--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-expression:6.2.5 (*)
|         \--- org.springframework:spring-web:6.2.5 (*)
+--- org.springframework.integration:spring-integration-http -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    \--- org.springframework:spring-webmvc:6.2.4 -> 6.2.5 (*)
\--- com.jcraft:jsch:0.1.55

runtimeClasspath - Runtime classpath of source set 'main'.
+--- org.springframework.boot:spring-boot-starter-integration -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4
|    |    |    +--- org.springframework:spring-core:6.2.5
|    |    |    |    \--- org.springframework:spring-jcl:6.2.5
|    |    |    \--- org.springframework:spring-context:6.2.5
|    |    |         +--- org.springframework:spring-aop:6.2.5
|    |    |         |    +--- org.springframework:spring-beans:6.2.5
|    |    |         |    |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |         +--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-expression:6.2.5
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         \--- io.micrometer:micrometer-observation:1.14.5
|    |    |              \--- io.micrometer:micrometer-commons:1.14.5
|    |    +--- org.springframework.boot:spring-boot-autoconfigure:3.4.4
|    |    |    \--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-starter-logging:3.4.4
|    |    |    +--- ch.qos.logback:logback-classic:1.5.18
|    |    |    |    +--- ch.qos.logback:logback-core:1.5.18
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.17
|    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.24.3
|    |    |    |    +--- org.apache.logging.log4j:log4j-api:2.24.3
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.16 -> 2.0.17
|    |    |    \--- org.slf4j:jul-to-slf4j:2.0.17
|    |    |         \--- org.slf4j:slf4j-api:2.0.17
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    \--- org.yaml:snakeyaml:2.3
|    \--- org.springframework.integration:spring-integration-core:6.4.3
|         +--- org.springframework:spring-aop:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-tx:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework.retry:spring-retry:2.0.11
|         +--- io.projectreactor:reactor-core:3.7.4
|         |    \--- org.reactivestreams:reactive-streams:1.0.4
|         \--- io.micrometer:micrometer-observation:1.14.5 (*)
+--- org.springframework.integration:spring-integration-sftp -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    +--- org.springframework.integration:spring-integration-file:6.4.3
|    |    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    |    \--- commons-io:commons-io:2.17.0
|    +--- org.springframework:spring-context-support:6.2.4 -> 6.2.5
|    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    +--- org.springframework:spring-context:6.2.5 (*)
|    |    \--- org.springframework:spring-core:6.2.5 (*)
|    \--- org.apache.sshd:sshd-sftp:2.14.0
|         +--- org.apache.sshd:sshd-core:2.14.0
|         |    +--- org.apache.sshd:sshd-common:2.14.0
|         |    |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
+--- org.springframework.boot:spring-boot-starter-web -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:3.4.4
|    |    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    |    +--- org.springframework:spring-web:6.2.5
|    |    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    |    \--- io.micrometer:micrometer-observation:1.14.5 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:3.4.4
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:10.1.39
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:10.1.39
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    +--- org.springframework:spring-web:6.2.5 (*)
|    \--- org.springframework:spring-webmvc:6.2.5
|         +--- org.springframework:spring-aop:6.2.5 (*)
|         +--- org.springframework:spring-beans:6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.5 (*)
|         +--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-expression:6.2.5 (*)
|         \--- org.springframework:spring-web:6.2.5 (*)
+--- org.springframework.integration:spring-integration-http -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    \--- org.springframework:spring-webmvc:6.2.4 -> 6.2.5 (*)
\--- com.jcraft:jsch:0.1.55

runtimeElements - Runtime elements for the 'main' feature. (n)
No dependencies

runtimeOnly - Runtime-only dependencies for the 'main' feature. (n)
No dependencies

testAndDevelopmentOnly - Configuration for test and development-only dependencies such as Spring Boot's DevTools.
No dependencies

testAnnotationProcessor - Annotation processors and their dependencies for source set 'test'.
No dependencies

testCompileClasspath - Compile classpath for source set 'test'.
+--- org.springframework.boot:spring-boot-starter-integration -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4
|    |    |    +--- org.springframework:spring-core:6.2.5
|    |    |    |    \--- org.springframework:spring-jcl:6.2.5
|    |    |    \--- org.springframework:spring-context:6.2.5
|    |    |         +--- org.springframework:spring-aop:6.2.5
|    |    |         |    +--- org.springframework:spring-beans:6.2.5
|    |    |         |    |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |         +--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-expression:6.2.5
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         \--- io.micrometer:micrometer-observation:1.14.5
|    |    |              \--- io.micrometer:micrometer-commons:1.14.5
|    |    +--- org.springframework.boot:spring-boot-autoconfigure:3.4.4
|    |    |    \--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-starter-logging:3.4.4
|    |    |    +--- ch.qos.logback:logback-classic:1.5.18
|    |    |    |    +--- ch.qos.logback:logback-core:1.5.18
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.17
|    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.24.3
|    |    |    |    +--- org.apache.logging.log4j:log4j-api:2.24.3
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.16 -> 2.0.17
|    |    |    \--- org.slf4j:jul-to-slf4j:2.0.17
|    |    |         \--- org.slf4j:slf4j-api:2.0.17
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    \--- org.yaml:snakeyaml:2.3
|    \--- org.springframework.integration:spring-integration-core:6.4.3
|         +--- org.springframework:spring-aop:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-tx:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework.retry:spring-retry:2.0.11
|         +--- io.projectreactor:reactor-core:3.7.4
|         |    \--- org.reactivestreams:reactive-streams:1.0.4
|         \--- io.micrometer:micrometer-observation:1.14.5 (*)
+--- org.springframework.integration:spring-integration-sftp -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    +--- org.springframework.integration:spring-integration-file:6.4.3
|    |    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    |    \--- commons-io:commons-io:2.17.0
|    +--- org.springframework:spring-context-support:6.2.4 -> 6.2.5
|    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    +--- org.springframework:spring-context:6.2.5 (*)
|    |    \--- org.springframework:spring-core:6.2.5 (*)
|    \--- org.apache.sshd:sshd-sftp:2.14.0
|         +--- org.apache.sshd:sshd-core:2.14.0
|         |    +--- org.apache.sshd:sshd-common:2.14.0
|         |    |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
+--- org.springframework.boot:spring-boot-starter-web -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:3.4.4
|    |    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    |    +--- org.springframework:spring-web:6.2.5
|    |    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    |    \--- io.micrometer:micrometer-observation:1.14.5 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:3.4.4
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:10.1.39
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:10.1.39
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    +--- org.springframework:spring-web:6.2.5 (*)
|    \--- org.springframework:spring-webmvc:6.2.5
|         +--- org.springframework:spring-aop:6.2.5 (*)
|         +--- org.springframework:spring-beans:6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.5 (*)
|         +--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-expression:6.2.5 (*)
|         \--- org.springframework:spring-web:6.2.5 (*)
+--- org.springframework.integration:spring-integration-http -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    \--- org.springframework:spring-webmvc:6.2.4 -> 6.2.5 (*)
+--- com.jcraft:jsch:0.1.55
+--- org.springframework.boot:spring-boot-starter-test -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-test:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    \--- org.springframework:spring-test:6.2.5
|    |         \--- org.springframework:spring-core:6.2.5 (*)
|    +--- org.springframework.boot:spring-boot-test-autoconfigure:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-test:3.4.4 (*)
|    |    \--- org.springframework.boot:spring-boot-autoconfigure:3.4.4 (*)
|    +--- com.jayway.jsonpath:json-path:2.9.0
|    +--- jakarta.xml.bind:jakarta.xml.bind-api:4.0.2
|    |    \--- jakarta.activation:jakarta.activation-api:2.1.3
|    +--- net.minidev:json-smart:2.5.2
|    |    \--- net.minidev:accessors-smart:2.5.2
|    |         \--- org.ow2.asm:asm:9.7.1
|    +--- org.assertj:assertj-core:3.26.3
|    |    \--- net.bytebuddy:byte-buddy:1.14.18 -> 1.15.11
|    +--- org.awaitility:awaitility:4.2.2
|    |    \--- org.hamcrest:hamcrest:2.1 -> 2.2
|    +--- org.hamcrest:hamcrest:2.2
|    +--- org.junit.jupiter:junit-jupiter:5.11.4
|    |    +--- org.junit:junit-bom:5.11.4
|    |    |    +--- org.junit.jupiter:junit-jupiter:5.11.4 (c)
|    |    |    +--- org.junit.jupiter:junit-jupiter-api:5.11.4 (c)
|    |    |    +--- org.junit.jupiter:junit-jupiter-params:5.11.4 (c)
|    |    |    \--- org.junit.platform:junit-platform-commons:1.11.4 (c)
|    |    +--- org.junit.jupiter:junit-jupiter-api:5.11.4
|    |    |    +--- org.junit:junit-bom:5.11.4 (*)
|    |    |    +--- org.opentest4j:opentest4j:1.3.0
|    |    |    +--- org.junit.platform:junit-platform-commons:1.11.4
|    |    |    |    +--- org.junit:junit-bom:5.11.4 (*)
|    |    |    |    \--- org.apiguardian:apiguardian-api:1.1.2
|    |    |    \--- org.apiguardian:apiguardian-api:1.1.2
|    |    \--- org.junit.jupiter:junit-jupiter-params:5.11.4
|    |         +--- org.junit:junit-bom:5.11.4 (*)
|    |         +--- org.junit.jupiter:junit-jupiter-api:5.11.4 (*)
|    |         \--- org.apiguardian:apiguardian-api:1.1.2
|    +--- org.mockito:mockito-core:5.14.2
|    |    +--- net.bytebuddy:byte-buddy:1.15.4 -> 1.15.11
|    |    \--- net.bytebuddy:byte-buddy-agent:1.15.4 -> 1.15.11
|    +--- org.mockito:mockito-junit-jupiter:5.14.2
|    |    \--- org.mockito:mockito-core:5.14.2 (*)
|    +--- org.skyscreamer:jsonassert:1.5.3
|    |    \--- com.vaadin.external.google:android-json:0.0.20131108.vaadin1
|    +--- org.springframework:spring-core:6.2.5 (*)
|    +--- org.springframework:spring-test:6.2.5 (*)
|    \--- org.xmlunit:xmlunit-core:2.10.0
\--- org.springframework.integration:spring-integration-test -> 6.4.3
     +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
     \--- org.springframework.integration:spring-integration-test-support:6.4.3
          +--- org.hamcrest:hamcrest-library:3.0 -> 2.2
          |    \--- org.hamcrest:hamcrest-core:2.2
          |         \--- org.hamcrest:hamcrest:2.2
          +--- org.mockito:mockito-core:5.14.2 (*)
          +--- org.assertj:assertj-core:3.26.3 (*)
          +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
          +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5 (*)
          \--- org.springframework:spring-test:6.2.4 -> 6.2.5 (*)

testCompileOnly - Compile only dependencies for source set 'test'. (n)
No dependencies

testImplementation - Implementation only dependencies for source set 'test'. (n)
+--- org.springframework.boot:spring-boot-starter-test (n)
\--- org.springframework.integration:spring-integration-test (n)

testRuntimeClasspath - Runtime classpath of source set 'test'.
+--- org.springframework.boot:spring-boot-starter-integration -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4
|    |    |    +--- org.springframework:spring-core:6.2.5
|    |    |    |    \--- org.springframework:spring-jcl:6.2.5
|    |    |    \--- org.springframework:spring-context:6.2.5
|    |    |         +--- org.springframework:spring-aop:6.2.5
|    |    |         |    +--- org.springframework:spring-beans:6.2.5
|    |    |         |    |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |         +--- org.springframework:spring-core:6.2.5 (*)
|    |    |         +--- org.springframework:spring-expression:6.2.5
|    |    |         |    \--- org.springframework:spring-core:6.2.5 (*)
|    |    |         \--- io.micrometer:micrometer-observation:1.14.5
|    |    |              \--- io.micrometer:micrometer-commons:1.14.5
|    |    +--- org.springframework.boot:spring-boot-autoconfigure:3.4.4
|    |    |    \--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-starter-logging:3.4.4
|    |    |    +--- ch.qos.logback:logback-classic:1.5.18
|    |    |    |    +--- ch.qos.logback:logback-core:1.5.18
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.17
|    |    |    +--- org.apache.logging.log4j:log4j-to-slf4j:2.24.3
|    |    |    |    +--- org.apache.logging.log4j:log4j-api:2.24.3
|    |    |    |    \--- org.slf4j:slf4j-api:2.0.16 -> 2.0.17
|    |    |    \--- org.slf4j:jul-to-slf4j:2.0.17
|    |    |         \--- org.slf4j:slf4j-api:2.0.17
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    \--- org.yaml:snakeyaml:2.3
|    \--- org.springframework.integration:spring-integration-core:6.4.3
|         +--- org.springframework:spring-aop:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-tx:6.2.4 -> 6.2.5
|         |    +--- org.springframework:spring-beans:6.2.5 (*)
|         |    \--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework.retry:spring-retry:2.0.11
|         +--- io.projectreactor:reactor-core:3.7.4
|         |    \--- org.reactivestreams:reactive-streams:1.0.4
|         \--- io.micrometer:micrometer-observation:1.14.5 (*)
+--- org.springframework.integration:spring-integration-sftp -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    +--- org.springframework.integration:spring-integration-file:6.4.3
|    |    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    |    \--- commons-io:commons-io:2.17.0
|    +--- org.springframework:spring-context-support:6.2.4 -> 6.2.5
|    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    +--- org.springframework:spring-context:6.2.5 (*)
|    |    \--- org.springframework:spring-core:6.2.5 (*)
|    \--- org.apache.sshd:sshd-sftp:2.14.0
|         +--- org.apache.sshd:sshd-core:2.14.0
|         |    +--- org.apache.sshd:sshd-common:2.14.0
|         |    |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         |    \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
|         \--- org.slf4j:slf4j-api:1.7.36 -> 2.0.17
+--- org.springframework.boot:spring-boot-starter-web -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-starter-json:3.4.4
|    |    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    |    +--- org.springframework:spring-web:6.2.5
|    |    |    +--- org.springframework:spring-beans:6.2.5 (*)
|    |    |    +--- org.springframework:spring-core:6.2.5 (*)
|    |    |    \--- io.micrometer:micrometer-observation:1.14.5 (*)
|    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3 (c)
|    |    |    |         +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3 (c)
|    |    |    |         \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3 (c)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3
|    |    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    +--- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.18.3
|    |    |    +--- com.fasterxml.jackson.core:jackson-annotations:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |    |    +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |    |    \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    |    \--- com.fasterxml.jackson.module:jackson-module-parameter-names:2.18.3
|    |         +--- com.fasterxml.jackson.core:jackson-core:2.18.3 (*)
|    |         +--- com.fasterxml.jackson.core:jackson-databind:2.18.3 (*)
|    |         \--- com.fasterxml.jackson:jackson-bom:2.18.3 (*)
|    +--- org.springframework.boot:spring-boot-starter-tomcat:3.4.4
|    |    +--- jakarta.annotation:jakarta.annotation-api:2.1.1
|    |    +--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    |    +--- org.apache.tomcat.embed:tomcat-embed-el:10.1.39
|    |    \--- org.apache.tomcat.embed:tomcat-embed-websocket:10.1.39
|    |         \--- org.apache.tomcat.embed:tomcat-embed-core:10.1.39
|    +--- org.springframework:spring-web:6.2.5 (*)
|    \--- org.springframework:spring-webmvc:6.2.5
|         +--- org.springframework:spring-aop:6.2.5 (*)
|         +--- org.springframework:spring-beans:6.2.5 (*)
|         +--- org.springframework:spring-context:6.2.5 (*)
|         +--- org.springframework:spring-core:6.2.5 (*)
|         +--- org.springframework:spring-expression:6.2.5 (*)
|         \--- org.springframework:spring-web:6.2.5 (*)
+--- org.springframework.integration:spring-integration-http -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    \--- org.springframework:spring-webmvc:6.2.4 -> 6.2.5 (*)
+--- com.jcraft:jsch:0.1.55
+--- org.springframework.boot:spring-boot-starter-test -> 3.4.4
|    +--- org.springframework.boot:spring-boot-starter:3.4.4 (*)
|    +--- org.springframework.boot:spring-boot-test:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    \--- org.springframework:spring-test:6.2.5
|    |         \--- org.springframework:spring-core:6.2.5 (*)
|    +--- org.springframework.boot:spring-boot-test-autoconfigure:3.4.4
|    |    +--- org.springframework.boot:spring-boot:3.4.4 (*)
|    |    +--- org.springframework.boot:spring-boot-test:3.4.4 (*)
|    |    \--- org.springframework.boot:spring-boot-autoconfigure:3.4.4 (*)
|    +--- com.jayway.jsonpath:json-path:2.9.0
|    |    +--- net.minidev:json-smart:2.5.0 -> 2.5.2
|    |    |    \--- net.minidev:accessors-smart:2.5.2
|    |    |         \--- org.ow2.asm:asm:9.7.1
|    |    \--- org.slf4j:slf4j-api:2.0.11 -> 2.0.17
|    +--- jakarta.xml.bind:jakarta.xml.bind-api:4.0.2
|    |    \--- jakarta.activation:jakarta.activation-api:2.1.3
|    +--- net.minidev:json-smart:2.5.2 (*)
|    +--- org.assertj:assertj-core:3.26.3
|    |    \--- net.bytebuddy:byte-buddy:1.14.18 -> 1.15.11
|    +--- org.awaitility:awaitility:4.2.2
|    |    \--- org.hamcrest:hamcrest:2.1 -> 2.2
|    +--- org.hamcrest:hamcrest:2.2
|    +--- org.junit.jupiter:junit-jupiter:5.11.4
|    |    +--- org.junit:junit-bom:5.11.4
|    |    |    +--- org.junit.jupiter:junit-jupiter:5.11.4 (c)
|    |    |    +--- org.junit.jupiter:junit-jupiter-api:5.11.4 (c)
|    |    |    +--- org.junit.jupiter:junit-jupiter-engine:5.11.4 (c)
|    |    |    +--- org.junit.jupiter:junit-jupiter-params:5.11.4 (c)
|    |    |    +--- org.junit.platform:junit-platform-engine:1.11.4 (c)
|    |    |    +--- org.junit.platform:junit-platform-launcher:1.11.4 (c)
|    |    |    \--- org.junit.platform:junit-platform-commons:1.11.4 (c)
|    |    +--- org.junit.jupiter:junit-jupiter-api:5.11.4
|    |    |    +--- org.junit:junit-bom:5.11.4 (*)
|    |    |    +--- org.opentest4j:opentest4j:1.3.0
|    |    |    \--- org.junit.platform:junit-platform-commons:1.11.4
|    |    |         \--- org.junit:junit-bom:5.11.4 (*)
|    |    +--- org.junit.jupiter:junit-jupiter-params:5.11.4
|    |    |    +--- org.junit:junit-bom:5.11.4 (*)
|    |    |    \--- org.junit.jupiter:junit-jupiter-api:5.11.4 (*)
|    |    \--- org.junit.jupiter:junit-jupiter-engine:5.11.4
|    |         +--- org.junit:junit-bom:5.11.4 (*)
|    |         +--- org.junit.platform:junit-platform-engine:1.11.4
|    |         |    +--- org.junit:junit-bom:5.11.4 (*)
|    |         |    +--- org.opentest4j:opentest4j:1.3.0
|    |         |    \--- org.junit.platform:junit-platform-commons:1.11.4 (*)
|    |         \--- org.junit.jupiter:junit-jupiter-api:5.11.4 (*)
|    +--- org.mockito:mockito-core:5.14.2
|    |    +--- net.bytebuddy:byte-buddy:1.15.4 -> 1.15.11
|    |    +--- net.bytebuddy:byte-buddy-agent:1.15.4 -> 1.15.11
|    |    \--- org.objenesis:objenesis:3.3
|    +--- org.mockito:mockito-junit-jupiter:5.14.2
|    |    +--- org.mockito:mockito-core:5.14.2 (*)
|    |    \--- org.junit.jupiter:junit-jupiter-api:5.11.2 -> 5.11.4 (*)
|    +--- org.skyscreamer:jsonassert:1.5.3
|    |    \--- com.vaadin.external.google:android-json:0.0.20131108.vaadin1
|    +--- org.springframework:spring-core:6.2.5 (*)
|    +--- org.springframework:spring-test:6.2.5 (*)
|    +--- org.xmlunit:xmlunit-core:2.10.0
|    \--- org.junit.platform:junit-platform-launcher -> 1.11.4
|         +--- org.junit:junit-bom:5.11.4 (*)
|         \--- org.junit.platform:junit-platform-engine:1.11.4 (*)
+--- org.springframework.integration:spring-integration-test -> 6.4.3
|    +--- org.springframework.integration:spring-integration-core:6.4.3 (*)
|    \--- org.springframework.integration:spring-integration-test-support:6.4.3
|         +--- org.hamcrest:hamcrest-library:3.0 -> 2.2
|         |    \--- org.hamcrest:hamcrest-core:2.2
|         |         \--- org.hamcrest:hamcrest:2.2
|         +--- org.mockito:mockito-core:5.14.2 (*)
|         +--- org.assertj:assertj-core:3.26.3 (*)
|         +--- org.springframework:spring-context:6.2.4 -> 6.2.5 (*)
|         +--- org.springframework:spring-messaging:6.2.4 -> 6.2.5 (*)
|         \--- org.springframework:spring-test:6.2.4 -> 6.2.5 (*)
\--- org.junit.platform:junit-platform-launcher -> 1.11.4 (*)

testRuntimeOnly - Runtime only dependencies for source set 'test'. (n)
\--- org.junit.platform:junit-platform-launcher (n)

(c) - A dependency constraint, not a dependency. The dependency affected by the constraint occurs elsewhere in the tree.
(*) - Indicates repeated occurrences of a transitive dependency subtree. Gradle expands transitive dependency subtrees only once per project; repeat occurrences only display the root of the subtree, followed by this annotation.

(n) - A dependency or dependency configuration that cannot be resolved.

A web-based, searchable dependency report is available by adding the --scan option.

BUILD SUCCESSFUL in 24s
1 actionable task: 1 executed
```