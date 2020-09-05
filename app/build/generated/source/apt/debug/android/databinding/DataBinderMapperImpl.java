package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ch.hevs.fbonvin.disasterassistance.DataBinderMapperImpl());
  }
}
