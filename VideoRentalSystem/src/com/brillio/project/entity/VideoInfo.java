package com.brillio.project.entity;

import java.util.Date;

public class VideoInfo {
	
	private int videoId;
	private String videoName;
	private double rating;
	private String videoGenre;
	private Date releaseDate;
	private String description;
	private String cast;
	private String directedBy;
	private String photo;
	private String trailer;
	
	public VideoInfo() {
		
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getVideoGenre() {
		return videoGenre;
	}

	public void setVideoGenre(String videoGenre) {
		this.videoGenre = videoGenre;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	@Override
	public String toString() {
		return String.format(
				"VideoInfo [videoId=%s, videoName=%s, rating=%s, videoGenre=%s, releaseDate=%s, description=%s, cast=%s, directedBy=%s, photo=%s, trailer=%s]",
				videoId, videoName, rating, videoGenre, releaseDate, description, cast, directedBy, photo, trailer);
	}
	
	
	
	
	
	

}
