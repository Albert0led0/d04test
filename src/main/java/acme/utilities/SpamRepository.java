/*
 * AuthenticatedConsumerRepository.java
 *
 * Copyright (C) 2012-2021 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.utilities;

import java.util.HashMap;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface SpamRepository extends AbstractRepository {

	@Query("select c.spamWords from Configuration c")
	HashMap<String, String> findSpamWords();
	
	@Query("select c.threshold from Configuration c")
	Double findThreshold();
}
