package com.ubs.kafka.producer.builder.configuration;

import com.ubs.kafka.configenum.KafkaSerializers;
import org.apache.kafka.common.serialization.Serializer;

/**
 * Created by dkoshkin on 4/2/16.
 */
public interface SerializerConfiguration<K, V> {
    OptionalConfiguration<K, V> keySerializer(Serializer<K> keySerializer);
    OptionalConfiguration<K, V> keySerializer(KafkaSerializers serializerEnum);
    OptionalConfiguration<K, V> valueSerializer(Serializer<V> valueSerializer);
    OptionalConfiguration<K, V> valueSerializer(KafkaSerializers serializerEnum);
}
