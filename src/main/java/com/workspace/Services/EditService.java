package com.workspace.Services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.workspace.Entity.Items;
import com.workspace.Entity.Dto.ItemsDto;
import com.workspace.Entity.Request.AddNewItemRequest;
import com.workspace.Entity.Request.DeleteItemRequest;
import com.workspace.Entity.Request.EditItemRequest;
import com.workspace.Repositories.ItemRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EditService {

	//コンストラクタインジェクション
	private final ItemRepository itemRepository;

	private final ModelMapper modelMapper;

	/**
	 * 新規Item追加用サービス
	 */
	public void addNewItemServe(AddNewItemRequest request) {
		ItemsDto itemDto = new ItemsDto(request.getName(), request.getAmount(),
				request.getUnit(), request.getDeadline(), request.getTag(), false, "");

		//ModelMapperを利用したDTO→Entityの詰め替え
		Items item = modelMapper.map(itemDto, Items.class);
		itemRepository.save(item);


	}

	/**
	 * 既存Item編集用サービス
	 */
	public void editItemServe(EditItemRequest request) {

		Optional<Items> itemOptional = itemRepository.findById(request.getId());

		if (itemOptional.isPresent()) {
			Items item = itemOptional.get();
			item.setName(request.getName());
			item.setAmount(request.getAmount());
			item.setUnit(request.getUnit());
			item.setDeadline(request.getDeadline());
			item.setTag(request.getTag());
			itemRepository.save(item);
		}
	}

	/**
	 * 既存Item削除用サービス
	 */
	public void deleteItemServe(DeleteItemRequest request, long id) {
		Optional<Items> itemOptional = itemRepository.findById(id);
		if (itemOptional.isPresent()) {
			Items item = itemOptional.get();
			item.setDeleteReason(request.getDeleteReason());
			item.setDeleteFlag(true);
			itemRepository.save(item);
		}

	}

}
