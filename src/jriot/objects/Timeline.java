package jriot.objects;

import java.util.List;

//Updated for Match Version 2.2

public class Timeline {
	private long frameInterval;
	private List<Frame> frames;
	
	public long getFrameInterval() {
		return frameInterval;
	}
	public void setFrameInterval(long frameInterval) {
		this.frameInterval = frameInterval;
	}
	public List<Frame> getFrames() {
		return frames;
	}
	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
	
	
}
