# scopehell
study Java EE scopes

comparing scope life time for Java EE.
currently, checking request, view, session and application scopes.

I used WildFly to check.
You can check its life cycle event in server.log.
If you configure log levels, life cycle events can be checked.

* javax.enterprise.resource.webcontainer.jsf.timing
* javax.enterprise.resource.webcontainer.jsf.lifecycle