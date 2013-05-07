#
# Autogenerated by Thrift Compiler (0.9.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'software_management_types'

module Software
  module Mgmt
    module Thrift
      module SoftwareManagement
        class Client
          include ::Thrift::Client

          def runClusterOperation(clusterOperation)
            send_runClusterOperation(clusterOperation)
            return recv_runClusterOperation()
          end

          def send_runClusterOperation(clusterOperation)
            send_message('runClusterOperation', RunClusterOperation_args, :clusterOperation => clusterOperation)
          end

          def recv_runClusterOperation()
            result = receive_message(RunClusterOperation_result)
            return result.success unless result.success.nil?
            raise result.coe unless result.coe.nil?
            raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'runClusterOperation failed: unknown result')
          end

          def getOperationStatusWithDetail(targetName)
            send_getOperationStatusWithDetail(targetName)
            return recv_getOperationStatusWithDetail()
          end

          def send_getOperationStatusWithDetail(targetName)
            send_message('getOperationStatusWithDetail', GetOperationStatusWithDetail_args, :targetName => targetName)
          end

          def recv_getOperationStatusWithDetail()
            result = receive_message(GetOperationStatusWithDetail_result)
            return result.success unless result.success.nil?
            raise result.coe unless result.coe.nil?
            raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'getOperationStatusWithDetail failed: unknown result')
          end

        end

        class Processor
          include ::Thrift::Processor

          def process_runClusterOperation(seqid, iprot, oprot)
            args = read_args(iprot, RunClusterOperation_args)
            result = RunClusterOperation_result.new()
            begin
              result.success = @handler.runClusterOperation(args.clusterOperation)
            rescue ::Software::Mgmt::Thrift::ClusterOperationException => coe
              result.coe = coe
            end
            write_result(result, oprot, 'runClusterOperation', seqid)
          end

          def process_getOperationStatusWithDetail(seqid, iprot, oprot)
            args = read_args(iprot, GetOperationStatusWithDetail_args)
            result = GetOperationStatusWithDetail_result.new()
            begin
              result.success = @handler.getOperationStatusWithDetail(args.targetName)
            rescue ::Software::Mgmt::Thrift::ClusterOperationException => coe
              result.coe = coe
            end
            write_result(result, oprot, 'getOperationStatusWithDetail', seqid)
          end

        end

        # HELPER FUNCTIONS AND STRUCTURES

        class RunClusterOperation_args
          include ::Thrift::Struct, ::Thrift::Struct_Union
          CLUSTEROPERATION = 1

          FIELDS = {
            CLUSTEROPERATION => {:type => ::Thrift::Types::STRUCT, :name => 'clusterOperation', :class => ::Software::Mgmt::Thrift::ClusterOperation}
          }

          def struct_fields; FIELDS; end

          def validate
          end

          ::Thrift::Struct.generate_accessors self
        end

        class RunClusterOperation_result
          include ::Thrift::Struct, ::Thrift::Struct_Union
          SUCCESS = 0
          COE = 1

          FIELDS = {
            SUCCESS => {:type => ::Thrift::Types::I32, :name => 'success'},
            COE => {:type => ::Thrift::Types::STRUCT, :name => 'coe', :class => ::Software::Mgmt::Thrift::ClusterOperationException}
          }

          def struct_fields; FIELDS; end

          def validate
          end

          ::Thrift::Struct.generate_accessors self
        end

        class GetOperationStatusWithDetail_args
          include ::Thrift::Struct, ::Thrift::Struct_Union
          TARGETNAME = 1

          FIELDS = {
            TARGETNAME => {:type => ::Thrift::Types::STRING, :name => 'targetName'}
          }

          def struct_fields; FIELDS; end

          def validate
          end

          ::Thrift::Struct.generate_accessors self
        end

        class GetOperationStatusWithDetail_result
          include ::Thrift::Struct, ::Thrift::Struct_Union
          SUCCESS = 0
          COE = 1

          FIELDS = {
            SUCCESS => {:type => ::Thrift::Types::STRUCT, :name => 'success', :class => ::Software::Mgmt::Thrift::OperationStatusWithDetail},
            COE => {:type => ::Thrift::Types::STRUCT, :name => 'coe', :class => ::Software::Mgmt::Thrift::ClusterOperationException}
          }

          def struct_fields; FIELDS; end

          def validate
          end

          ::Thrift::Struct.generate_accessors self
        end

      end

    end
  end
end