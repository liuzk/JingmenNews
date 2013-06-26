package cn.com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.com.entity.FsNews1;

@Service
public class FsNews1Service extends BaseService<FsNews1> {

	public List<FsNews1> getOneNewsTop30(Class<FsNews1> clazz) {
		return createQuery(
				FsNews1.class,
				"where rownum<=30 and ParentId='07112109321626936' and audittf=1 order by addDate");
	}
}
