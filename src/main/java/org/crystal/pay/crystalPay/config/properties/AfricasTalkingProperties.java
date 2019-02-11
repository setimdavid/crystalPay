package org.crystal.pay.crystalPay.config.properties;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class AfricasTalkingProperties {
    @Value("${org.app.properties.config.africastalking.integ.username.data}")
    private String integUsernameData;
    @Value("${org.app.properties.config.africastalking.integ.username.keyword}")
    private String integUsernameKeyword;
    @Value("${org.app.properties.config.africastalking.integ.sender}")
    private String integSender;
    @Value("${org.app.properties.config.africastalking.response.code.http.created}")
    private int responseCodeHttpCreated;
    @Value("${org.app.properties.config.africastalking.prod.api.host}")
    private String prodApiHost;
    @Value("${org.app.properties.config.africastalking.sms.url}")
    private String smsUrl;
    @Value("${org.app.properties.config.africastalking.integ.to.keyword}")
    private String integToKeyword;
    @Value("${org.app.properties.config.africastalking.integ.from.keyword}")
    private String integFromKeyword;
    @Value("${org.app.properties.config.africastalking.url.header.accept.keyword}")
    private String urlHeaderAcceptKeyword;
    @Value("${org.app.properties.config.africastalking.url.header.accept.data}")
    private String urlHeaderAcceptData;
    @Value("${org.app.properties.config.africastalking.url.header.api.keyword}")
    private String urlHeaderApiKeyword;
    @Value("${org.app.properties.config.africastalking.url.header.api.data}")
    private String urlHeaderApiData;
    @Value("${org.app.properties.config.africastalking.sms.message.data.keyword}")
    private String smsMessageDataKeyword;
    @Value("${org.app.properties.config.africastalking.integ.response.recipients.keyword}")
    private String integResponseRecipientsKeyword;
    @Value("${org.app.properties.config.africastalking.integ.response.message.keyword}")
    private String integResponseMessageKeyword;
    @Value("${org.app.properties.config.africastalking.integ.sms.message.keyword}")
    private String integSmsMessageKeyword;
    @Value("${org.app.properties.config.africastalking.integ.http.method.post}")
    private String integHttpMethodPost;
}