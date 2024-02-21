package cz.claimcloud.user.repository;

import cz.claimcloud.user.model.entity.CamundaTaskEvent;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CamundaTaskEventElasticRepository extends ElasticsearchRepository<CamundaTaskEvent, String> {
}
