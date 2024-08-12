package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class BulletController {
	private LinkedList<Bullet> bl = new LinkedList<Bullet>();
	
	public void tick(){
		for(int i=0; i < bl.size(); i++){
			if(bl.get(i).getY() < 0){
				removeBullet(bl.get(i));
			}else{
				bl.get(i).tick();
			}
		}
	}
	
	public void render(Graphics g){
		for(int i=0; i < bl.size(); i++){
			bl.get(i).render(g);
		}
	}
	
	public void addBullet(Bullet bullet){
		bl.add(bullet);
	}
	
	public void removeBullet(Bullet bullet){
		bl.remove(bullet);
	}
}
