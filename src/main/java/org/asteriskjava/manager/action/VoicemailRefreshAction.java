package org.asteriskjava.manager.action;

/**
 * Created by tareqmy on 2019-07-14.
 */
public class VoicemailRefreshAction extends AbstractManagerAction {

	static final long serialVersionUID = 1L;

	private String context;
	private String mailbox;

	public VoicemailRefreshAction() {
	}

	public VoicemailRefreshAction(String context, String mailbox) {
		this.context = context;
		this.mailbox = mailbox;
	}

	@Override
	public String getAction() {
		return "VoicemailRefresh";
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getMailbox() {
		return mailbox;
	}

	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
}
