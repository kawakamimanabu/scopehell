# scopehell
sample for studying Java EE scopes

comparing scope life time for Java EE.
currently, checking request, view, session and application scopes.

Every time you click "CountUp(with navigation)", the request is sent and page will be refreshed.
If you click "CountUp(with ajax)", the counter display will be updated.

With JDK9, following dependency is necessary.
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.0</version>
</dependency>


I used WildFly to check.
You can check its life cycle event in server.log.
If you configure log levels, life cycle events can be checked.

* javax.enterprise.resource.webcontainer.jsf.timing
* javax.enterprise.resource.webcontainer.jsf.lifecycle



