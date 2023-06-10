Zookeeper default port: 2181
Kafka Server default port 9092

What is Kafka leader and follower?


Kafka: There are partitions in kafka. Every partition of a topic has a specified leader and multiple followers. The leader handles all incoming read and write requests for that specific partition, while the followers replicate the data from the leader passively.


1. Start the zookeeper:

bin/zookeeper-server-start.sh config/zookeeper.properties

2. Start the Kafka broker:
   bin/kafka-server-start.sh config/server.properties


3. Create a Topic:

bin/kafka-topics.sh --bootstrap-server localhost:9092 --create  --topic mytopic1 --partitions 3 --replication-factor 1    # because 1 broker

bin/kafka-topics.sh --bootstrap-server localhost:9092 --create  --topic jyotik --partitions 3 --replication-factor 1

4. List topic:

bin/kafka-topics.sh --bootstrap-server localhost:9092 --list

5. Describe topic:
   bin/kafka-topics.sh --bootstrap-server localhost:9092  --describe  --topic jyotik

6. Delete topic
   bin/kafka-topics.sh --bootstrap-server localhost:9092  --delete  --topic mytopic1


7. Start producer
   bin/kafka-console-producer.sh --broker-list localhost:9092 --topic jyotik

bin/kafka-console-producer.sh --broker-list 192.168.0.14:9092 --topic mytopic2
192.168.0.14

8. Start consumer

bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mytopic1
bin/kafka-console-consumer.sh --bootstrap-server 192.168.0.14:9092 --topic mytopic2

192.168.0.14

https://stackoverflow.com/questions/37539580/buffer-underflow-while-fetching-message-from-kafka

9. Publish build message

bin/kafka-console-producer.sh --broker-list localhost:9092 --topic mytopic1</Users/ksharma/Documents/Kafka/Data.csv



To run confluent Kafka

1. Start zookeeper:
   bin/zookeeper-server-start etc/kafka/zookeeper.properties

2. Start Kafka Server

bin/kafka-server-start etc/kafka/server.properties


3. Create a Topic:

bin/kafka-topics  --bootstrap-server localhost:9092 --create  --topic mytopic3 --partitions 3 --replication-factor 1    # because 1 broker

bin/kafka-topics --bootstrap-server localhost:9092 --create  --topic mytopic2 --partitions 3 --replication-factor 1

4. Start producer
   bin/kafka-console-producer  --broker-list localhost:9092 --topic mytopic3

5. Start consumer

bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic mytopic3
