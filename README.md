# sb-app
git clone https://github.com/miksmes/sb-app.git
mvn package
java -jar springboot-k8s-demo.jar			#check
curl -X GET http://localhost:8080			#check
docker build -t springboot-k8s-example:lts .
docker images
docker tag springboot-k8s-example:lts mikhailyesman/sbifk8s:lts
docker push mikhailyesman/sbifk8s:lts
