package com.api.ConsumeAPI.Repository;

import com.api.ConsumeAPI.DTO.PostDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostDTO,Long> {
}
