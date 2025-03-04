///
//  Generated code. Do not modify.
//  source: services/common/v1/common.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

// ignore_for_file: UNDEFINED_SHOWN_NAME
import 'dart:core' as $core;
import 'package:protobuf/protobuf.dart' as $pb;

class ResponseStatus extends $pb.ProtobufEnum {
  static const ResponseStatus SUCCESS = ResponseStatus._(
      0,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'SUCCESS');
  static const ResponseStatus WALLET_ACCESS_DENIED = ResponseStatus._(
      10,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'WALLET_ACCESS_DENIED');
  static const ResponseStatus WALLET_EXISTS = ResponseStatus._(
      11,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'WALLET_EXISTS');
  static const ResponseStatus ITEM_NOT_FOUND = ResponseStatus._(
      20,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'ITEM_NOT_FOUND');
  static const ResponseStatus SERIALIZATION_ERROR = ResponseStatus._(
      200,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'SERIALIZATION_ERROR');
  static const ResponseStatus UNKNOWN_ERROR = ResponseStatus._(
      100,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'UNKNOWN_ERROR');

  static const $core.List<ResponseStatus> values = <ResponseStatus>[
    SUCCESS,
    WALLET_ACCESS_DENIED,
    WALLET_EXISTS,
    ITEM_NOT_FOUND,
    SERIALIZATION_ERROR,
    UNKNOWN_ERROR,
  ];

  static final $core.Map<$core.int, ResponseStatus> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static ResponseStatus? valueOf($core.int value) => _byValue[value];

  const ResponseStatus._($core.int v, $core.String n) : super(v, n);
}

class SupportedDidMethod extends $pb.ProtobufEnum {
  static const SupportedDidMethod KEY = SupportedDidMethod._(
      0,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'KEY');
  static const SupportedDidMethod ION = SupportedDidMethod._(
      1,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'ION');
  static const SupportedDidMethod INDY = SupportedDidMethod._(
      2,
      const $core.bool.fromEnvironment('protobuf.omit_enum_names')
          ? ''
          : 'INDY');

  static const $core.List<SupportedDidMethod> values = <SupportedDidMethod>[
    KEY,
    ION,
    INDY,
  ];

  static final $core.Map<$core.int, SupportedDidMethod> _byValue =
      $pb.ProtobufEnum.initByValue(values);
  static SupportedDidMethod? valueOf($core.int value) => _byValue[value];

  const SupportedDidMethod._($core.int v, $core.String n) : super(v, n);
}
