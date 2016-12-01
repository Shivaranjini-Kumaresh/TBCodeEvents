package com.microsoft.azure.tbcode.eventhub.data;

import java.time.LocalDateTime;

public class TBCodeEventData {
	private String id;
	private String partitionId;
	private LocalDateTime createTime;
	private Integer value;
	private Integer count;
	
	public static TBCodeEventDataBuilder builder() {
		return new TBCodeEventDataBuilder();
	}
	
	public static class TBCodeEventDataBuilder {
		private TBCodeEventData tbCodeEventData = new TBCodeEventData();
		
		public TBCodeEventDataBuilder id(String id) {
			tbCodeEventData.id = id;
			return this;
		}
		public TBCodeEventDataBuilder createTime(LocalDateTime date) {
			tbCodeEventData.createTime = date;
			return this;
		}
		public TBCodeEventDataBuilder value(Integer value) {
			tbCodeEventData.value = value;
			return this;
		}
		public TBCodeEventDataBuilder count(Integer count) {
			tbCodeEventData.count = count;
			return this;
		}
		public TBCodeEventDataBuilder partitionId(String partitionId) {
			tbCodeEventData.partitionId = partitionId;
			return this;
		}
		public TBCodeEventData build() {
			return tbCodeEventData;
		}
	}
	
	public String getId() {
		return this.id;
	}
	
	public LocalDateTime getCreateTime() {
		return this.createTime;
	}
	
	public Integer getValue() {
		return this.value;
	}
	
	public Integer getCount() {
		return this.count;
	}
	
	public String getPartitionId() {
		return this.partitionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((partitionId == null) ? 0 : partitionId.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TBCodeEventData other = (TBCodeEventData) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (partitionId == null) {
			if (other.partitionId != null)
				return false;
		} else if (!partitionId.equals(other.partitionId))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TBCodeEventData [id=" + id + ", partitionId=" + partitionId + ", createTime=" + createTime + ", value="
				+ value + ", count=" + count + "]";
	}

}
