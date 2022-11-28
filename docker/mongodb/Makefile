build:
	docker build -t mongo .
run:
	docker run -d -p 27017:27017 -v /docker/mongo:/app -v /mongo/data:/data/db --name=mongo mongo
exec:
	docker exec -it mongo /bin/bash
logs:
	docker logs mongo
ps:
	docker ps -a
img:
	docker images
rm:
	docker rm -f $$(docker ps -qa)
rmi:
	docker rmi $$(docker images -q)
