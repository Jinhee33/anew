# step 1 : base image
FROM ubuntu:latest

# step 2 :
RUN apt -y update && apt -y upgrade && apt -y install nginx && apt -y install curl

# step 3 :
COPY index.html /usr/share/nginx/html

# step 4 :
HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost/ || exit 1

# step 5 :
CMD ["nginx","-g","daemon off;"]
