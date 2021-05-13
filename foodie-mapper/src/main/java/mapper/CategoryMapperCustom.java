package mapper;

import foodie.backend.my.mapper.MyMapper;
import foodie.backend.pojo.Category;
import foodie.backend.pojo.vo.CategoryVO;
import foodie.backend.pojo.vo.NewItemsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CategoryMapperCustom {
    public List<CategoryVO> getSubCatList(Integer rootCatId);

    public List<NewItemsVO> getSixNewItemsLazy(@Param("paramsMap") Map<String, Object> map);
}