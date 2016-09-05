package io.indexcity.report.service;

import io.indexcity.report.domain.Item;
import io.indexcity.report.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Item.
 */
@Service
public class ItemService {

    private final Logger log = LoggerFactory.getLogger(ItemService.class);
    
    @Inject
    private ItemRepository itemRepository;

    /**
     * Save a item.
     *
     * @param item the entity to save
     * @return the persisted entity
     */
    public Item save(Item item) {
        log.debug("Request to save Item : {}", item);
        Item result = itemRepository.save(item);
        return result;
    }

    /**
     *  Get all the items.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    public Page<Item> findAll(Pageable pageable) {
        log.debug("Request to get all Items");
        Page<Item> result = itemRepository.findAll(pageable);
        return result;
    }

    /**
     *  Get one item by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    public Item findOne(String id) {
        log.debug("Request to get Item : {}", id);
        Item item = itemRepository.findOne(id);
        return item;
    }

    /**
     *  Delete the  item by id.
     *
     *  @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete Item : {}", id);
        itemRepository.delete(id);
    }
}
