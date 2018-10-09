Archetypes to create wildfly-jaxrs-service

# How to install wildfly-jaxrs-service-archetype

Change to the wildfly-jaxrs-service-archetype, clean and install the package by running:

    $ cd wildfly-jaxrs-service-archetype
    $ mvn clean install

Now is the package available through your local m2 repository.

# How to create a new service

Change to the middleware directory and run the following command to create "new-service". Replace the name "new-service" accordingly.

    $ mvn archetype:generate \
        -DarchetypeGroupId=sk.lorman.jee7.archetype \
        -DarchetypeArtifactId=wildfly-jaxrs-service-archetype \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=sk.lorman.jee7 \
        -DartifactId=new-service \
        -Dpackage=sk.lorman.jee7.newservice \
        -Dversion=1.0.0-SNAPSHOT \
        -DswaggerApiName="New Service"

Make sure to set the package parameter properly. In the other services it is a combination of the groupId and the artifactId.

There are another parameters which you may set. Those are:
 * swaggerApiDescription: description that will be set for the JaxRS swagger description of the service.
 * enableAntrun: adds Antrun plugin to pom.xml
 * enableChekstyle: adds checkstyle plugin to pom.xml
 * enableFindbugs: adds findbugs plugin to pom.xml
 * enablePmd: adds pmd plugin to pom.xml
 * useBuildTools: adds some information about the build-tools
 * buildToolsGroupId: the groupId of build-tools. If not set, it will use ${project.groupId}
 * buildToolsVersion: the version of the build-tools, e.g. 1.0.0-SNAPSHOT
 * useInternalNexus: use SB nexus, default = true

You can add the Swagger api description by passing the following line to the maven command line from above:

    -DswaggerApiDescription="This is a new service"
