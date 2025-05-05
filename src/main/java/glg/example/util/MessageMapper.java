package glg.example.util;

import io.swagger.client.model.ExperimentMessage;
import io.swagger.client.model.Message;

public class MessageMapper {
    public static ExperimentMessage mapToExperimentMessage(Message message) {
        if (message == null) {
            return null;
        }

        ExperimentMessage experimentMessage = new ExperimentMessage();

        experimentMessage.setCallToAction(message.getCallToAction());
        experimentMessage.setChannel(message.getChannel());
        experimentMessage.setLink(message.getLink());
        experimentMessage.setMessageId(message.getMessageId());
        experimentMessage.setParentId(message.getParentId());

        experimentMessage.setRichContents(message.getRichContents());

        return experimentMessage;
    }
}
