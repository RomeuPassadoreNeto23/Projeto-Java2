package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
	private Date monment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post() {
	}

	public Post(Date monment, String title, String content, Integer likes) {
		this.monment = monment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMonment() {
		return monment;
	}

	public void setMonment(Date monment) {
		this.monment = monment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append("likes -");
		sb.append(sdf.format(monment) + "\n");
		sb.append(content + "\n");
		for (Comment c : comments) {
			sb.append(c.getTex() + "\n");
		}
		return sb.toString();
	}

}
