<h1>Using Google App Engine with Spring Boot Applications</h1>

Spring Boot uses Servlet 3.0 APIs to initialize the ServletContext (register Servlets etc.) so you 
can’t use the same application out of the box in a Servlet 2.5 container. It is however possible to 
run a Spring Boot application on an older container with some special tools. If you include 
org.springframework.boot:spring-boot-legacy as a dependency (maintained separately to the core of Spring 
Boot and currently available at 1.0.2.RELEASE), all you should need to do is create a web.xml and declare 
a context listener to create the application context and your filters and servlets. The context listener 
is a special purpose one for Spring Boot, but the rest of it is normal for a Spring application in Servlet 2.5

Visit for more Information: http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-servlet-2-5

<h3> Steps </h3>

- Depends on spring-boot-legacy (which you will need to build and install locally) as shown below

```
$ git clone https://github.com/scratches/spring-boot-legacy
$ cd spring-boot-legacy
$ mvn install
```

- Clone this demo as shown below

```
$ https://github.com/papicella/GoogleAppEngineSpringBoot.git
$ mvn package
```

- Target your project for deployment as follows

```
pasapicella@pas-macbook:~/piv-projects/GoogleAppEngineSpringBoot$ gcloud projects list
PROJECT_ID              NAME                    PROJECT_NUMBER
bionic-vertex-150302    AppEngineSpringBoot     97889500330
fe-papicella            FE-papicella            1049163203721
pas-spring-boot-on-gcp  Pas Spring Boot on GCP  1043917887789

pasapicella@pas-macbook:~/piv-projects/GoogleAppEngineSpringBoot$ gcloud config set project fe-papicella
Updated property [core/project].

```

- deploy as follows

```
$ mvn appengine:deploy
```

![alt tag](https://dl.dropboxusercontent.com/u/15829935/platform-demos/images/gae-springboot-1.png)

<hr />
Pas Apicella [papicella at pivotal.io] is a Senior Platform Architect at Pivotal Australia 
