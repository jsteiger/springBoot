package hello;

//@Configuration
public class RabbitMqConfig {

    /*
    @Value("${rabbitmq.ingest.host:localhost}")
    private String rabbitMqHost;

    @Value("${rabbitmq.ingest.port:5672}")
    private Integer rabbitMqPort;

    @Value("${rabbitmq.ingest.user:guest}")
    private String rabbitMqUsername;

    @Value("${rabbitmq.ingest.pass:guest}")
    private String rabbitMqPassword;

    @Value("${rabbitmq.ingest.exchange.name:exc.publish.exchange}")
    private String rabbitMqExchange;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(rabbitMqHost);
        connectionFactory.setUsername(rabbitMqUsername);
        connectionFactory.setPassword(rabbitMqPassword);
        if (rabbitMqPort != null) {
            connectionFactory.setPort(rabbitMqPort);
        }
        return connectionFactory;
    }

    @Bean
    public RabbitTemplate publishRabbitTemplate(ConnectionFactory connectionFactory,
                                                MessageConverter messageConverter) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setExchange(rabbitMqExchange);
        template.setMessageConverter(messageConverter);
        return template;
    }

    @Bean
    public MessageConverter jsonMessageConverter(ClassMapper classMapper) {
        Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
        converter.setClassMapper(classMapper);
        return converter;
    }

    @Bean
    public DefaultClassMapper classMapper() {
        Map<String, Class<?>> idClassMapping = new HashMap<>();
        DefaultClassMapper typeMapper = new DefaultClassMapper();
        typeMapper.setIdClassMapping(idClassMapping);
        return typeMapper;
    }
    */
}
