build:
	docker build -t python .
run :
	docker run -d -it --name python -p 8000:8000 -v /python:/app python
exec :
	docker exec -it python /bin/bash
logs :
	docker logs python
ps :
	docker ps -a
img :
	docker images
rm :
	docker rm -f $$(docker ps -aq)
rmi :
	docker rmi $$(docker images -q)
