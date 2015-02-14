//
//  MFIAPManager.m
//  Magic Flood
//
//  Created by Anukrity Jain on 14/2/15.
//  Copyright (c) 2015 EzeeIdeas. All rights reserved.
//

#import "MFIAPManager.h"
#import "MFIAPInterface.h"

@implementation MFIAPManager

-(void)initialize
{
    //load the bundled product list
    NSString *id_iap_remove_ads = @IAP_REMOVE_ADS;
    NSString *id_iap_coins_first = @ IAP_COINS_FIRST;
    NSString *id_iap_coins_second = @ IAP_COINS_SECOND;
    NSString *id_iap_coins_third = @ IAP_COINS_THIRD;
    NSString *id_iap_coins_fourth = @ IAP_COINS_FOURTH;
    self.products = [NSArray arrayWithObjects: id_iap_remove_ads, id_iap_coins_first, id_iap_coins_second,
                     id_iap_coins_third, id_iap_coins_fourth, nil];
    
    //query items
    [self queryItems];
}

-(void)queryItems
{
    SKProductsRequest *productsRequest = [[SKProductsRequest alloc]
                                          initWithProductIdentifiers:[NSSet setWithArray:self.products]];
    productsRequest.delegate = self;
    [productsRequest start];
}
// SKProductsRequestDelegate protocol method
- (void)productsRequest:(SKProductsRequest *)request
     didReceiveResponse:(SKProductsResponse *)response
{
    BOOL allIsWell = YES;
    
    for (NSString *invalidIdentifier in response.invalidProductIdentifiers) {
        for (int i = 0; i < [self.products count]; i++)
        {
            if ([[self.products objectAtIndex:i] isEqualToString:invalidIdentifier])
            {
                //something's wrong
                allIsWell = NO;
                break;
            }
        }
        
        if (!allIsWell)
        {
            break;
        }
    }
    
    if (!allIsWell)
    {
        return;
    }
    
    //NSLog(@"response.products = %p, count = %d", response.products, [response.products count]);
    /*
    for (int i = 0; i < 5; i++)
    {
                SKProduct *product = [response.products objectAtIndex:i];
        NSLog(@"%d: SKProduct = %p, product = %p", i, [response.products objectAtIndex:i], product);

    }
    NSArray *newArray = response.products;
     */
    self.products = nil;
    self.products = [response.products copy];
    /*
    for (int i = 0; i < 5; i++)
    {
        SKProduct *product = [self.products objectAtIndex:i];
        NSLog(@"%d: SKProduct = %p, product = %p", i, [self.products objectAtIndex:i], product);
        
    }
     */
    self.mIsSynchronized = YES;
}

@end
