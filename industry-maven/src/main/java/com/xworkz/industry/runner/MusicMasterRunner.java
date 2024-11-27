package com.xworkz.industry.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.industry.dto.MusicMasterDTO;

public class MusicMasterRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("industry");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<MusicMasterDTO> dto = new ArrayList<MusicMasterDTO>();
		dto.add(new MusicMasterDTO("Neene Saakida Gini", "Amrithadhare", "Sonu Nigam", "Drama", "2005", "00:05:10","Manomurthy", "false", "/music/amrithadhare/neene_saakida_gini.mp3"));
		dto.add(new MusicMasterDTO("Anisuthide Yako Indu", "Mungaru Male", "Sonu Nigam", "Romance", "2006", "00:05:25", "Manomurthy", "false", "/music/mungaru_male/anisuthide_yako_indu.mp3"));
		dto.add(new MusicMasterDTO("Kariya I Love You", "Duniya", "V. Harikrishna", "Drama", "2007", "00:05:35", "V. Harikrishna", "false", "/music/duniya/kariya_i_love_you.mp3"));
		dto.add(new MusicMasterDTO("Hrudaya Samudra", "Milana", "Sonu Nigam", "Romance", "2007", "00:04:45", "Manomurthy", "false", "/music/milana/hrudaya_samudra.mp3"));
		dto.add(new MusicMasterDTO("Sanju Weds Geetha", "Sanju Weds Geetha", "Karthik", "Romance", "2011", "00:04:50", "Jesse Gift", "false", "/music/sanju_weds_geetha/sanju_weds_geetha.mp3"));
		dto.add(new MusicMasterDTO("Yenidu Manasali", "Drama", "Sonu Nigam", "Drama", "2012", "00:05:00", "V. Harikrishna", "false", "/music/drama/yenidu_manasali.mp3"));
		dto.add(new MusicMasterDTO("Kaddalu Manasanna", "Mussanje Maathu", "Sonu Nigam", "Drama", "2008", "00:04:35", "V. Sridhar", "false", "/music/mussanje_maathu/kaddalu_manasanna.mp3"));
		dto.add(new MusicMasterDTO("Bombe Helutaithe", "Raajakumara", "V. Harikrishna", "Drama", "2017", "00:04:20", "V. Harikrishna", "false", "/music/raajakumara/bombe_helutaithe.mp3"));
		dto.add(new MusicMasterDTO("Ninna Poojege Bande Mahadeshwara", "Bhajarangi", "Arjun Janya", "Devotional", "2013", "00:03:35", "Arjun Janya", "false", "/music/bhajarangi/ninna_poojege_bande_mahadeshwara.mp3"));
		dto.add(new MusicMasterDTO("Geleya Geleya", "Chakravarthy", "Shankar Mahadevan", "Action", "2016", "00:04:25", "Arjun Janya", "false", "/music/chakravarthy/geleya_geleya.mp3"));
		dto.add(new MusicMasterDTO("Kannada Nadina Jeevanadhi", "Bharjari", "Sanjith Hegde", "Romance", "2017", "00:04:00", "V. Harikrishna", "false", "/music/bharjari/kannada_nadina_jeevanadhi.mp3"));
		dto.add(new MusicMasterDTO("Ondu Malebillu", "Chakravarthy", "Sonu Nigam, Shreya Ghoshal", "Romance", "2016", "00:04:00", "Arjun Janya", "false", "/music/chakravarthy/ondu_malebillu.mp3"));
		dto.add(new MusicMasterDTO("Belakina Kavithe", "Kirik Party", "Vijay Prakash, Anuradha Bhat", "Drama", "2016", "00:04:00", "B. Ajaneesh Loknath", "false", "/music/kirik_party/belakina_kavithe.mp3"));
		dto.add(new MusicMasterDTO("Ninna Nodalenthu", "Chirru", "Sonu Nigam", "Drama", "2010", "00:04:25", "Joshua Sridhar", "false", "/music/chirru/ninna_nodalenthu.mp3"));
		dto.add(new MusicMasterDTO("Gaatiya Ilidu", "Ulidavaru Kandanthe", "Prajwal Pai", "Drama", "2014", "00:03:25", "Ajaneesh Loknath", "false", "/music/ulidavaru_kandanthe/gaatiya_ilidu.mp3"));

		for (MusicMasterDTO musicMasterDTO : dto) {
			MusicMasterDTO musicMaster = new MusicMasterDTO();
			musicMaster.setTrackName(musicMasterDTO.getTrackName());
			musicMaster.setAlbumName(musicMasterDTO.getAlbumName());
			musicMaster.setArtistName(musicMasterDTO.getArtistName());
			musicMaster.setGenre(musicMasterDTO.getGenre());
			musicMaster.setReleaseYear(musicMasterDTO.getReleaseYear());
			musicMaster.setDuration(musicMasterDTO.getDuration());
			musicMaster.setLabel(musicMasterDTO.getLabel());
			musicMaster.setIsExplicit(musicMasterDTO.getIsExplicit());
			musicMaster.setFilePath(musicMasterDTO.getFilePath());

			em.persist(musicMaster);
		}

		try {
			et.begin();
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}

}
