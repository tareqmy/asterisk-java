package org.asteriskjava.manager.event;

import org.asteriskjava.manager.action.QueueSummaryAction;

/**
 * A QueueSummaryCompleteEvent is triggered after the summary for all requested
 * queues has been reported in response to a QueueSummaryAction.
 * 
 * @see QueueSummaryAction
 * @see QueueSummaryEvent
 * @author srt
 * @version $Id$
 * @since 0.3
 */
public class QueueSummaryCompleteEvent extends ResponseEvent
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = -5044247858568827143L;

	private Integer listItems;
	private String eventList;

    public QueueSummaryCompleteEvent(Object source)
    {
        super(source);
    }

	public Integer getListItems() {
		return listItems;
	}

	public void setListItems(Integer listItems) {
		this.listItems = listItems;
	}

	public String getEventList() {
		return eventList;
	}

	public void setEventList(String eventList) {
		this.eventList = eventList;
	}
}
