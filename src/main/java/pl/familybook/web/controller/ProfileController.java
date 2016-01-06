package pl.familybook.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.familybook.models.Profile;
import pl.familybook.repositories.ProfileRepository;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
	@Autowired
	private ProfileRepository profileRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Profile> findAll() {
		return profileRepository.findAll();
	}
}
