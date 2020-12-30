package com.reminderer.remindererservices.service.schedule;

import java.util.List;

public interface ScheduleDescriptorService {
	Long createScheduleDecriptor(ScheduleDescriptor scheduleDescriptor);
	List<ScheduleDescriptor> fetchAllScheduleDescriptors();
	ScheduleDescriptor fetchScheduleDescriptorById(Long id);
	Boolean deleteScheduleDescriptor(Long id);
	
}
