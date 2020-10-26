# package
```
cd case-template
```

```
mvn clean package
```

# deploy
```
nohup java -jar ./target/case-template-0.0.1-SNAPSHOT.jar >./deploy.log 2>&1 &
```

# test api
```
http://localhost:8080/data/list
```
