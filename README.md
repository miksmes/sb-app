# sb-app
git clone https://github.com/miksmes/sb-app.git
mvn package
java -jar springboot-k8s-demo.jar			#check
curl -X GET http://localhost:8080			#check
docker build -t springboot-k8s-example:lts .
docker images
docker tag springboot-k8s-example:lts mikhailyesman/sbifk8s:lts
docker push mikhailyesman/sbifk8s:lts


Links for Spring Boot Application in k8s:

https://hub.docker.com/repository/registry-1.docker.io/mikhailyesman/sbifk8s/tags?page=1&ordering=last_updated

https://www.udemy.com/course/kubernetes-foundations/learn/lecture/28695514#overview
vhttps://www.youtube.com/watch?v=ThP-OEjpDZk&list=PLg5SS_4L6LYvN1RqaVesof8KAf-02fJSi&index=11&ab_channel=ADV-IT
https://github.com/vitovts/K8s/tree/44b7f3711359e48bafcd7b74c8a1ce9306525f5d/adv-it
https://github.com/adv4000/k8s-lessons/tree/master/Lesson-12-HelmCharts

https://spring.io/guides/gs/spring-boot-kubernetes/
https://medium.com/@javatechie/kubernetes-tutorial-run-deploy-spring-boot-application-in-k8s-cluster-using-yaml-configuration-3b079154d232
https://docs.oracle.com/en-us/iaas/developer-tutorials/tutorials/spring-on-k8s/01oci-spring-k8s-summary.htm

https://github.com/bitnami/charts/tree/master/bitnami/nginx/#installing-the-chart
