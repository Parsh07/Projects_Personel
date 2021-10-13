package LinkedListChallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
			
		Album album = new Album("Baarishein", "Anuv Jain");
		album.addSong("Barish", 3.46);
		album.addSong("Alag Aasman", 4.22);
		album.addSong("Riha", 2.19);
		album.addSong("Gul", 4.36);
		album.addSong("Mishri", 5.00);
		albums.add(album);
		
		album = new Album("Kabir singh", "Arijit Singh");
		album.addSong("Bekhayali", 4.26);
		album.addSong("Kaise hua", 4.33);
		album.addSong("Tujhe kitana chahne lage", 4.44);
		album.addSong("Mere Sohneya", 3.26);
		album.addSong("Tera ban jaunga", 2.27);
		album.addSong("Yeh aaina", 3.22);
		album.addSong("Pehla pyaar", 5.32);
		album.addSong("Bekhayali Accoustic", 6.11);
		albums.add(album);
	
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlaylist("Barish", playList);
		albums.get(1).addToPlaylist("Bekhayali", playList);
		albums.get(1).addToPlaylist("Kaise hua", playList);
		albums.get(0).addToPlaylist("Riha", playList);
		albums.get(1).addToPlaylist("Tera ban jaunga", playList);
		play(playList);
	}
	
	public static void play(LinkedList<Song> playList) {
		ListIterator<Song> listIterator = playList.listIterator();
		ArrayList<Song> wishlist = new ArrayList<Song>();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		}
		else {
			System.out.println("Now playing - "+listIterator.next().toString());
		}
		
		boolean quit = false;
		boolean forward = true;

		printMenu();
		while(!quit) {
			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
			
			switch(action) {
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;
					
				case 1:
					if(!forward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						forward=true;
					}
					if(listIterator.hasNext()) {
						System.out.println("Now playing - "+listIterator.next().toString());
						forward=true;
					}
					else {
						System.out.println("Reached at the end of the playlist");
						forward=false;
					}
					break;
					
				case 2:
					if(forward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing - "+listIterator.previous().toString());
					}
					else {
						System.out.println("We are at the start of the playlist");
					}
					break;
					
				case 3:
					break;
					
				case 4:
					printPlaylist(playList);
					break;
					
				case 5:
					printMenu();
					break;
					
				case 6:
					if(playList.size()>0) {
						listIterator.remove();
						System.out.println("Song removed from playlist");
						if(listIterator.hasNext()) {
							System.out.println("Now playing - "+listIterator.next());
						}
						else if(listIterator.hasPrevious()){
							System.out.println("Now playing - "+listIterator.previous());
						}
					}
					break;
					
				case 7:
					if(listIterator.hasPrevious()) {
						wishlist.add(listIterator.previous());
						System.out.println("Song is added to wishlist");
						forward=false;
					}
					else {
						wishlist.add(listIterator.next());
						System.out.println("Song is added to wishlist");
						forward=true;
					}
					break;
					
				case 8:
					printWishlist(wishlist);
					break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions : \npress");
		System.out.println("0 - to quit\n"+
					"1 - to play next song\n"+
					"2 - to play previous song\n"+
					"3 - to replay the current song\n"+
					"4 - list songs in the playlist\n"+
					"5 - print available actions\n"+
					"6 - remove the current song from playlist\n"+
					"7 - Wishlist the song\n"+
					"8 - print the wishlist");
	}
	
	private static void printPlaylist(LinkedList<Song> playList) {
		ListIterator<Song> listIterator = playList.listIterator();
		
		System.out.println("=================Playlist===================");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("============================================");
	}
	
	private static void printWishlist(ArrayList<Song> wishlist) {
		Iterator<Song> iterator = wishlist.iterator();
		System.out.println("==================Wishlist===================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=============================================");
	}
}
