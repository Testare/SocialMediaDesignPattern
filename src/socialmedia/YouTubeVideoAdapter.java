/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author Testare
 */
public class YouTubeVideoAdapter implements SocialMediaEntry {
	YouTubeVideo video;
	
	public YouTubeVideoAdapter(YouTubeVideo video) {
		this.video = video;
	}
	
	@Override
	public String getUser() {
		return video.getAuthor();
	}
	@Override
	public String getPostText() {
		return video.getTitle();
	}
}
