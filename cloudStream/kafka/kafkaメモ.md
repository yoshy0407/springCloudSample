以下でトピックを作成

```
docker exec -it docker_kafka_1 bash -c 'kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test-topic'
```

データ投入
```
docker exec -it dokcer_kafka_1 bash -c 'kafka-console-producer --broker-list kafka:9092 --topic test-topic'
```