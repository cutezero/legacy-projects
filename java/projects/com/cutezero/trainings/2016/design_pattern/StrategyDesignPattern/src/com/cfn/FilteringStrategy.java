package com.cfn;

import java.util.List;

public interface FilteringStrategy {
	List<Message> filter(List<Message> messagesList);
}
