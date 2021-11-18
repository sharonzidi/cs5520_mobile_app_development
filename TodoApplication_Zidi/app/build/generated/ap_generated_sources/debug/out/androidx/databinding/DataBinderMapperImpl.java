package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new edu.neu.khoury.madsea.zidixia.DataBinderMapperImpl());
  }
}
