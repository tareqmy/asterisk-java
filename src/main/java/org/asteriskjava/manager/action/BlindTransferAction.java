package org.asteriskjava.manager.action;

/**
 * Created by tareqmy on 2019-07-14.
 */
public class BlindTransferAction extends AbstractManagerAction {

	static final long serialVersionUID = 1L;

	private String channel;
	private String exten;
	private String context;

	public BlindTransferAction() {
	}

	public BlindTransferAction(String channel, String exten, String context) {
		this.channel = channel;
		this.exten = exten;
		this.context = context;
	}

	@Override
	public String getAction() {
		return "BlindTransfer";
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExten() {
		return exten;
	}

	public void setExten(String exten) {
		this.exten = exten;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}
