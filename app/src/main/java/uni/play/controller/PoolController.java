package uni.play.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uni.play.dto.CreatePoolRequest;
import uni.play.dto.CreatePoolResponse;
import uni.play.dto.ClosePoolResponse;
import uni.play.service.UniswapService;

@RestController
@RequestMapping("/api/pools")
public class PoolController {

    private final UniswapService uniswapService;

    public PoolController(UniswapService uniswapService) {
        this.uniswapService = uniswapService;
    }

    @PostMapping
    public ResponseEntity<CreatePoolResponse> createPool(@RequestBody CreatePoolRequest request) {
        String tx = uniswapService.createPool(request);
        return ResponseEntity.ok(new CreatePoolResponse(tx));
    }

    @PostMapping("/{poolAddress}/close")
    public ResponseEntity<ClosePoolResponse> closePool(@PathVariable String poolAddress) {
        String tx = uniswapService.closePool(poolAddress);
        return ResponseEntity.ok(new ClosePoolResponse(tx));
    }
}
