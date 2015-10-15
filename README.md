# jaas-user-getter

This little ditty is a JAX-RS web service in a war that requires basic authentication, then returns the JAAS subject.

This thing doesn't set up any auth or auth for you; if you have JAAS set up, it will just return the user id.  That's all.

Modify web.xml and weblogic.xml configuration to change the role expected and the realm name expected.

Add server-specific configuration if needed for another server besides weblogic.
