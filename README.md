**docker-compose up --build -d**

Compose can now delegate builds to bake for better performance.
 To do so, set COMPOSE_BAKE=true.
[+] Building 6.4s (13/13) FINISHED                                                         docker:desktop-linux
 => [web internal] load build definition from Dockerfile                                                   0.5s
 => => transferring dockerfile: 996B                                                                       0.5s
 => [web internal] load metadata for docker.io/library/amazoncorretto:23-alpine                            0.8s
 => [web auth] library/amazoncorretto:pull token for registry-1.docker.io                                  0.0s
 => [web internal] load .dockerignore                                                                      0.0s
 => => transferring context: 2B                                                                            0.0s
 => [web 1/6] FROM docker.io/library/amazoncorretto:23-alpine@sha256:f5b7ec4d6eb0e2d5ffbd8a126132d5c73b2f  0.0s
 => => resolve docker.io/library/amazoncorretto:23-alpine@sha256:f5b7ec4d6eb0e2d5ffbd8a126132d5c73b2fc06b  0.0s
 => [web internal] load build context                                                                      0.0s
 => => transferring context: 3.66kB                                                                        0.0s
 => CACHED [web 2/6] WORKDIR /app                                                                          0.0s
 => CACHED [web 3/6] COPY build.gradle.kts gradlew gradlew.bat settings.gradle.kts /app/                   0.0s
 => CACHED [web 4/6] COPY gradle /app/gradle/                                                              0.0s
 => CACHED [web 5/6] RUN ./gradlew dependencies --no-daemon                                                0.0s
 => CACHED [web 6/6] COPY src ./src/                                                                       0.0s
 => [web] exporting to image                                                                               4.9s
 => => exporting layers                                                                                    0.0s
 => => exporting manifest sha256:9ca1e9a0f38fc17c6d15d1f230cd534c07ddadb8a718a333dcfa05c828f24454          0.0s
 => => exporting config sha256:e11f24e6eaf02a8da6bceb5797aa414a9729380de9a8310d9509c118d27a00cf            0.0s
 => => exporting attestation manifest sha256:809a20d0240a4f266c7b0a01561601b87bccc9061da9d24bcaf5c6eb1255  0.2s
 => => exporting manifest list sha256:d06e103d5e62d73d67ac6974d2ff15eb3f8a6787aafabfc5f486631c1a2de350     0.0s
 => => naming to docker.io/library/dcompose-web:latest                                                     0.0s
 => => unpacking to docker.io/library/dcompose-web:latest                                                  4.4s
 => [web] resolving provenance for metadata file                                                           0.0s
[+] Running 4/4
 ✔ web                         Built                                                                       0.0s 
 ✔ Network dcompose_default    Created                                                                     0.1s 
 ✔ Container dcompose-mysql-1  Healthy                                                                     6.8s 
 ✔ Container dcompose-web-1    Started                                                                     6.2s 
<img width="637" alt="image" src="https://github.com/user-attachments/assets/5f5c8f69-1835-4934-8f43-df8995bff31a" />


<img width="754" alt="image" src="https://github.com/user-attachments/assets/a7da66d8-fc6d-448b-870f-2aa72b43dda1" />

<img width="672" alt="image" src="https://github.com/user-attachments/assets/d6c1f548-e134-4a94-b8cb-f20889a32e5d" />


docker-compose down

[+] Running 3/3
 ✔ Container dcompose-web-1    Removed                                                                     0.6s 
 ✔ Container dcompose-mysql-1  Removed                                                                     1.0s 
 ✔ Network dcompose_default    Removed                                                                     0.2s 
<img width="584" alt="image" src="https://github.com/user-attachments/assets/319d4b20-e2c0-4aa0-9e3a-7f51fd49360c" />
