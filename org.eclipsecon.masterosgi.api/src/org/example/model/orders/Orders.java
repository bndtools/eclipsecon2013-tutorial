// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders.proto

package org.example.model.orders;

public final class Orders {
  private Orders() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OrderOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string symbol = 1;
    boolean hasSymbol();
    String getSymbol();
    
    // required int64 unitPrice = 2;
    boolean hasUnitPrice();
    long getUnitPrice();
    
    // required int64 quantity = 3;
    boolean hasQuantity();
    long getQuantity();
    
    // required .org.example.model.orders.Order.Side side = 4;
    boolean hasSide();
    org.example.model.orders.Orders.Order.Side getSide();
  }
  public static final class Order extends
      com.google.protobuf.GeneratedMessage
      implements OrderOrBuilder {
    // Use Order.newBuilder() to construct.
    private Order(Builder builder) {
      super(builder);
    }
    private Order(boolean noInit) {}
    
    private static final Order defaultInstance;
    public static Order getDefaultInstance() {
      return defaultInstance;
    }
    
    public Order getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.model.orders.Orders.internal_static_org_example_model_orders_Order_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.model.orders.Orders.internal_static_org_example_model_orders_Order_fieldAccessorTable;
    }
    
    public enum Side
        implements com.google.protobuf.ProtocolMessageEnum {
      BID(0, 0),
      ASK(1, 1),
      ;
      
      public static final int BID_VALUE = 0;
      public static final int ASK_VALUE = 1;
      
      
      public final int getNumber() { return value; }
      
      public static Side valueOf(int value) {
        switch (value) {
          case 0: return BID;
          case 1: return ASK;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Side>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Side>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Side>() {
              public Side findValueByNumber(int number) {
                return Side.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.example.model.orders.Orders.Order.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Side[] VALUES = {
        BID, ASK, 
      };
      
      public static Side valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private Side(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:org.example.model.orders.Order.Side)
    }
    
    private int bitField0_;
    // required string symbol = 1;
    public static final int SYMBOL_FIELD_NUMBER = 1;
    private java.lang.Object symbol_;
    public boolean hasSymbol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getSymbol() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          symbol_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int64 unitPrice = 2;
    public static final int UNITPRICE_FIELD_NUMBER = 2;
    private long unitPrice_;
    public boolean hasUnitPrice() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getUnitPrice() {
      return unitPrice_;
    }
    
    // required int64 quantity = 3;
    public static final int QUANTITY_FIELD_NUMBER = 3;
    private long quantity_;
    public boolean hasQuantity() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getQuantity() {
      return quantity_;
    }
    
    // required .org.example.model.orders.Order.Side side = 4;
    public static final int SIDE_FIELD_NUMBER = 4;
    private org.example.model.orders.Orders.Order.Side side_;
    public boolean hasSide() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public org.example.model.orders.Orders.Order.Side getSide() {
      return side_;
    }
    
    private void initFields() {
      symbol_ = "";
      unitPrice_ = 0L;
      quantity_ = 0L;
      side_ = org.example.model.orders.Orders.Order.Side.BID;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSymbol()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUnitPrice()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasQuantity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSide()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSymbolBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, unitPrice_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, quantity_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, side_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSymbolBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, unitPrice_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, quantity_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, side_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.example.model.orders.Orders.Order parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.example.model.orders.Orders.Order parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.example.model.orders.Orders.Order parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.example.model.orders.Orders.Order parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.example.model.orders.Orders.Order prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.example.model.orders.Orders.OrderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.model.orders.Orders.internal_static_org_example_model_orders_Order_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.model.orders.Orders.internal_static_org_example_model_orders_Order_fieldAccessorTable;
      }
      
      // Construct using org.example.model.orders.Orders.Order.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        symbol_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        unitPrice_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        quantity_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        side_ = org.example.model.orders.Orders.Order.Side.BID;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.model.orders.Orders.Order.getDescriptor();
      }
      
      public org.example.model.orders.Orders.Order getDefaultInstanceForType() {
        return org.example.model.orders.Orders.Order.getDefaultInstance();
      }
      
      public org.example.model.orders.Orders.Order build() {
        org.example.model.orders.Orders.Order result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.example.model.orders.Orders.Order buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.example.model.orders.Orders.Order result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.example.model.orders.Orders.Order buildPartial() {
        org.example.model.orders.Orders.Order result = new org.example.model.orders.Orders.Order(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.symbol_ = symbol_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.unitPrice_ = unitPrice_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.quantity_ = quantity_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.side_ = side_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.example.model.orders.Orders.Order) {
          return mergeFrom((org.example.model.orders.Orders.Order)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.example.model.orders.Orders.Order other) {
        if (other == org.example.model.orders.Orders.Order.getDefaultInstance()) return this;
        if (other.hasSymbol()) {
          setSymbol(other.getSymbol());
        }
        if (other.hasUnitPrice()) {
          setUnitPrice(other.getUnitPrice());
        }
        if (other.hasQuantity()) {
          setQuantity(other.getQuantity());
        }
        if (other.hasSide()) {
          setSide(other.getSide());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSymbol()) {
          
          return false;
        }
        if (!hasUnitPrice()) {
          
          return false;
        }
        if (!hasQuantity()) {
          
          return false;
        }
        if (!hasSide()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              symbol_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              unitPrice_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              quantity_ = input.readInt64();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              org.example.model.orders.Orders.Order.Side value = org.example.model.orders.Orders.Order.Side.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                side_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string symbol = 1;
      private java.lang.Object symbol_ = "";
      public boolean hasSymbol() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getSymbol() {
        java.lang.Object ref = symbol_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          symbol_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSymbol(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbol_ = value;
        onChanged();
        return this;
      }
      public Builder clearSymbol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        symbol_ = getDefaultInstance().getSymbol();
        onChanged();
        return this;
      }
      void setSymbol(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        symbol_ = value;
        onChanged();
      }
      
      // required int64 unitPrice = 2;
      private long unitPrice_ ;
      public boolean hasUnitPrice() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getUnitPrice() {
        return unitPrice_;
      }
      public Builder setUnitPrice(long value) {
        bitField0_ |= 0x00000002;
        unitPrice_ = value;
        onChanged();
        return this;
      }
      public Builder clearUnitPrice() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unitPrice_ = 0L;
        onChanged();
        return this;
      }
      
      // required int64 quantity = 3;
      private long quantity_ ;
      public boolean hasQuantity() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getQuantity() {
        return quantity_;
      }
      public Builder setQuantity(long value) {
        bitField0_ |= 0x00000004;
        quantity_ = value;
        onChanged();
        return this;
      }
      public Builder clearQuantity() {
        bitField0_ = (bitField0_ & ~0x00000004);
        quantity_ = 0L;
        onChanged();
        return this;
      }
      
      // required .org.example.model.orders.Order.Side side = 4;
      private org.example.model.orders.Orders.Order.Side side_ = org.example.model.orders.Orders.Order.Side.BID;
      public boolean hasSide() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public org.example.model.orders.Orders.Order.Side getSide() {
        return side_;
      }
      public Builder setSide(org.example.model.orders.Orders.Order.Side value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        side_ = value;
        onChanged();
        return this;
      }
      public Builder clearSide() {
        bitField0_ = (bitField0_ & ~0x00000008);
        side_ = org.example.model.orders.Orders.Order.Side.BID;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.example.model.orders.Order)
    }
    
    static {
      defaultInstance = new Order(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.example.model.orders.Order)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_model_orders_Order_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_example_model_orders_Order_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014orders.proto\022\030org.example.model.orders" +
      "\"\212\001\n\005Order\022\016\n\006symbol\030\001 \002(\t\022\021\n\tunitPrice\030" +
      "\002 \002(\003\022\020\n\010quantity\030\003 \002(\003\0222\n\004side\030\004 \002(\0162$." +
      "org.example.model.orders.Order.Side\"\030\n\004S" +
      "ide\022\007\n\003BID\020\000\022\007\n\003ASK\020\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_example_model_orders_Order_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_example_model_orders_Order_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_example_model_orders_Order_descriptor,
              new java.lang.String[] { "Symbol", "UnitPrice", "Quantity", "Side", },
              org.example.model.orders.Orders.Order.class,
              org.example.model.orders.Orders.Order.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}