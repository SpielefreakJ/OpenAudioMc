package net.openaudiomc.speakerSystem.objects;

import org.bukkit.Bukkit;
import org.bukkit.Location;

/**
 * Created by mats on 23-4-2017.
 */
public class audioSpeaker {
	
	String id;
	Location location;
	String soundid;
	
    public audioSpeaker(String id, Location loc, String sid) {
    	System.out.println("New speaker. ID:"+sid + " BLOCK:"+loc.getBlock().getType());
    	this.id = id;
    	this.location = loc;
    	this.soundid = sid;
    	
    }
    
    public Location getLoc() {
    	return this.location;
    }
    
    public String getSoundId() {
    	return this.soundid;
    }
    
    public String getId() {
    	return this.id;
    }

}
