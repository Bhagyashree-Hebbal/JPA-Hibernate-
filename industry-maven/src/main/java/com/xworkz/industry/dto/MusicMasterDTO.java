package com.xworkz.industry.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musicmaster_table")
public class MusicMasterDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "track_name")
	private String trackName;

	@Column(name = "album_name")
	private String albumName;

	@Column(name = "artist_name")
	private String artistName;

	private String genre;

	@Column(name = "release_year")
	private String releaseYear;

	private String duration;

	private String label;

	@Column(name = "is_explicit")
	private String isExplicit;

	@Column(name = "file_path")
	private String filePath;

	public MusicMasterDTO() {
		System.out.println("No-arg const");
	}

	public MusicMasterDTO(String trackName, String albumName, String artistName, String genre, String releaseYear,
			String duration, String label, String isExplicit, String filePath) {
		super();
		this.trackName = trackName;
		this.albumName = albumName;
		this.artistName = artistName;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.duration = duration;
		this.label = label;
		this.isExplicit = isExplicit;
		this.filePath = filePath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIsExplicit() {
		return isExplicit;
	}

	public void setIsExplicit(String isExplicit) {
		this.isExplicit = isExplicit;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
